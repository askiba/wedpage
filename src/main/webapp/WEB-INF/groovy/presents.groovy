import wedpage.model.Present

def p = new Present(name:"Żelazko", details:"Jakieś żelazko", link:new URI("www.example.com"))
plist = [p]

request.list = plist

forward '/WEB-INF/pages/presents.gtpl'
