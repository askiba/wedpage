import wedpage.model.Present
import com.google.appengine.api.datastore.KeyFactory
import com.google.appengine.api.datastore.Key

def reserve_present(id) {
	Key key = KeyFactory.createKey("Present", id)
	def present = datastore.get(key) as Present
	if (present == null) {
		throw new NoSuchElementException("A present with this id does not exist in the database.")
	}
	request.reservedPresent = present.name
	def success = present.reserve()
	log.info(success.toString())
	if(!success) {
		request.success = false
		log.info("RESERVED")
	} else {
		log.info("NOT RESERVED")
		request.success = true
	}
}

reserve_present(Long.parseLong(params.id))

//def dispatcher = request.getRequestDispatcher("/presents")
//
//dispatcher.redirect(request, response) 

forward '/presents.groovy'

//for (attr in request.attributeNames) {
//	log.info(attr)
//}
//
//forward '/presents'