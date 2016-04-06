import es.quindimil.Library

class BootStrap {

    def init = { servletContext ->

        Library library = new Library(name: 'Bookstore')
        library.addToBooks(title: 'Batman', area: 'US')
        library.addToBooks(title: 'Mortadelo y Filemón', area: 'ES')
        library.save()
    }
    def destroy = {
    }
}
