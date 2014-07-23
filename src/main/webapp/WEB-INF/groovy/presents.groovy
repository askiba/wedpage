import wedpage.model.Present
import com.google.appengine.api.datastore.Link

def reserve_present = {
	def id = params.id 
	def key = KeyFactory.createKey("Present", id)
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

def list() {
	def p = new Present(name:"Żelazko", details:"Jakieś żelazko", link: "www.example.com", price: "100,00")
	def r = new Present(name:"Żelazko2", details:"Jakieś żelazko", link: "www.example.com", price: "150,00", reserved: true)
//	datastore.withTransaction(true) {
//		Present.findAll().each { present ->
//			present.delete()
//		}		
//	}
//	
//	p.save()
//	r.save()
	
	plist = Present.findAll()
	request.list = plist
}

binding.setProperty("reserve", reserve_present)

list()

forward '/WEB-INF/pages/presents.gtpl'
