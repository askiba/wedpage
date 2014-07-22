
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/presents", forward: "/presents.groovy"
post "/presents/reserve", forward: "/reservePresent.groovy"
//get "/datetime", forward: "/datetime.groovy"

get "/favicon.ico", redirect: "/images/favicon.ico"
