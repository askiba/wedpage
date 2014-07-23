import wedpage.model.Present

if(params.link.size() == 0) {
	params.link = null
}

def p = new Present(name:params.name, details: params.details, link:params.link, price: params.price)
p.save()

forward '/WEB-INF/pages/add.gtpl'