import geb.spock.GebSpec

class SmokeSpec extends GebSpec {
    void "main page title should be 'Strona g³ówna'"() {
        when:
        go ''

        then:
        title == 'Strona g³ówna'
    }
}
