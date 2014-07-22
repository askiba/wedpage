
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/presents", forward: "/presents.groovy"
get "/presents/add", forward: "/WEB-INF/pages/add.gtpl"
post "/presents/add", forward: "/addPresent.groovy"
post "/presents/reserve", forward: "/reservePresent.groovy"
//get "/datetime", forward: "/datetime.groovy"

get "/favicon.ico", redirect: "/images/favicon.ico"
