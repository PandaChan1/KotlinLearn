package example

import com.sun.org.apache.xpath.internal.operations.Bool

data class Country(   //数据类
    val name: String,
    val continiet: String,
    val population: Int)


class CountryAPP {
    fun filterCountries(countries: List<Country>,test: (Country) -> Boolean): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continiet == "EU") {
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(countries: List<Country>, continiet: String): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if(c.continiet == continiet) {
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(countries: List<Country>, continiet: String, population: Int): List<Country> {
        val res = mutableListOf<Country>()
        for(c in countries) {
            if (c.population == population && c.continiet == continiet) {
                res.add(c)
            }
        }
        return res
    }

}

class CountryTest{
    fun isBigEuropeanCountry(country:Country): Boolean {
        return country.continiet == "EU" && country.population > 10000
    }
}

