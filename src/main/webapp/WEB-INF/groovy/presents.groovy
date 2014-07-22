import wedpage.model.Present
import com.google.appengine.api.datastore.Link

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

list()

forward '/WEB-INF/pages/presents.gtpl'
