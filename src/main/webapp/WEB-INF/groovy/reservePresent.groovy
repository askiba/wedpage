import wedpage.model.Present
import com.google.appengine.api.datastore.KeyFactory
import com.google.appengine.api.datastore.Key
def reserve_present(id) {
	Key key = KeyFactory.createKey("Present", id)
	def present = datastore.get(key) as Present
	if (present == null) {
		throw new NoSuchElementException("A present with this id does not exist in the database.")
	}
	request.reservationComplete = true
	if(!present.reserve()) {
		request.success = false
	} else {
		request.success = true
	}
}

reserve_present(Long.parseLong(params.id))

redirect '/presents'

//forward 'WEB_INF/pages/reservation.gtpl'