import geb.spock.GebSpec

class SmokeSpec extends GebSpec {
    void "main page title should be 'Strona g��wna'"() {
        when:
        go ''

        then:
        title == 'Strona g��wna'
    }
}
