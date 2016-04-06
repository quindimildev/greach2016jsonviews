package es.quindimil

import grails.rest.*
import grails.converters.*

class LibraryController {

    /**
     * Default action which shows an easy welcome message
     */
    def index() { }

    /** Shows a library instance with gson views
     * @param id instance
     * @return library instance
     */
    def show(){
        [library: Library.get(params.id)]
    }
}
