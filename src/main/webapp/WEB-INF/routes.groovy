
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/presents", forward: "/presents.groovy"
get "/presents/", redirect: "/presents"
post "/presents", forward: "/reservePresent.groovy"
//get "/presents", forward: "/presents.groovy"
get "/presents/add", forward: "/WEB-INF/pages/add.gtpl"
post "/presents/add", forward: "/addPresent.groovy"
//get "/datetime", forward: "/datetime.groovy"

get "/favicon.ico", redirect: "/images/favicon.ico"
