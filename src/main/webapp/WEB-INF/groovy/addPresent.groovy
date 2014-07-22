import wedpage.model.Present

def p = new Present(name:params.name, details: params.details, link:params.link, price: params.price)
p.save()

forward '/WEB-INF/pages/add.gtpl'