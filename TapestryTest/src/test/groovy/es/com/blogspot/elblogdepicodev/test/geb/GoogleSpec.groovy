package es.com.blogspot.elblogdepicodev.test.geb

import geb.spock.GebSpec
 
class GoogleSpec extends GebSpec {
    def 'go to google'() {
        when:
        go 'http://www.google.es'
 
        then:
        title == 'Google'
    }
}
