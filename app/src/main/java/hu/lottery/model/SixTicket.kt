/**
* Swagger Lottery Database
* This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
*
* OpenAPI spec version: 1.0.0
* Contact: vagonoran@gmail.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package hu.lottery.model


/**
 * 
 * @param numbers 
 * @param week 
 */
data class SixTicket (
    val numbers: kotlin.Array<kotlin.Int>? = null,
    val week: kotlin.Int? = null
) {

}

