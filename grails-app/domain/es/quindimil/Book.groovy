package es.quindimil

class Book {

    String title
    String area

    static belongsTo = [library: Library]

}
