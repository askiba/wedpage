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
	
	def boolean reserve() {
		def datastore = DatastoreServiceFactory.datastoreService
		datastore.withTransaction {
			if (reserved) {
				return false
			}
			else {
				reserved = true
				save()
				return true
			}
		}
	}	
}
