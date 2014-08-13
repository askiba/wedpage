package wedpage.model

import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed
import groovyx.gaelyk.datastore.Ignore
import groovyx.gaelyk.datastore.Entity

import com.google.appengine.api.datastore.Link
import com.google.appengine.api.datastore.DatastoreServiceFactory

@Entity(unindexed = false)
class Present {
	String name
	String details
	String link
	boolean reserved
	String price
	Date reservationDate
	
	def boolean reserve() {
		def datastore = DatastoreServiceFactory.datastoreService
		
		def retval = false
		
		datastore.withTransaction {
			if (reserved) {
				retval = false
			}
			else {
				reserved = true
				reservationDate = new Date()
				this.save()
				retval = true
			}
		}
		
		return retval
	}	
}
