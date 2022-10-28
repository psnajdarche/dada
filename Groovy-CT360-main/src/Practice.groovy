class Practice {
    static void main(String[] args) {
        //Lista, mapa
        def aleksa = ["dusan","bojan","aca","rista"]
        for(x in aleksa)
        {println x}

        def aleksa2 = [1,2,3]
        aleksa2.each{println it}

        def employee = ['name':'Aleksa', 'age':24]
        employee.each{key,value->'$key:$value'}

        //Regex
        def rec = "Aleksa" =~ "a"
        if(rec){
            println rec[0]
        }
        else {
            println "No match"
        }

        //Operator
        String output = (-1>0) ? "-1 is greather than 0" : "-1 isnt greather than 0"
        String ime = "Aleksa"
        String result = (ime != null && ime.length()>0) ? "name exist" : "does not"

       Aleksa veseli = new Aleksa()
        veseli.unos("Aleksa","Veselinovic")
        veseli.ispis()

    }
}

