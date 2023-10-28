package com.example.mad_practical_11_21012011069

import org.json.JSONObject
import java.io.Serializable

class Person (
    var id:String,
    var emailid:String,
    var name:String,
    var phoneNo:String,
    var address: String,
    var latitude:Double,
    var longitude:Double):Serializable{
    constructor(jsonObject: JSONObject):this("","","","","",0.0,0.0) {
        id = jsonObject.getString("id")
        emailid = jsonObject.getString("email")
        phoneNo = jsonObject.getString("phone")
        val profileJson = jsonObject.getJSONObject("profile")
        name = profileJson.getString("name")
        address = profileJson.getString("address")
        val locationJson = profileJson.getJSONObject("location")
        latitude = locationJson.getDouble("lat")
        longitude = locationJson.getDouble("long")
    }


}

