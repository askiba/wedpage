package wedpage.model

import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed
import groovyx.gaelyk.datastore.Ignore
import groovyx.gaelyk.datastore.Entity

@Entity(unindexed = false)
class Present {
	String name
	String details
	URI link	
}
