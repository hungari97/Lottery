package hu.lottery.model

import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.ArrayList

import com.google.gson.annotations.SerializedName


@ApiModel(description = "")
data class SixTicket (

    /**
     */
    @SerializedName("numbers")
    @get:ApiModelProperty(value = "")
    var numbers: List<Int> = ArrayList(),

    /**
     */
    @SerializedName("week")
    @get:ApiModelProperty(value = "")
    var week: Int? = null) {


    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val sixTicket = other as SixTicket?
        return numbers == sixTicket!!.numbers && week == sixTicket.week
    }

    override fun hashCode(): Int {
        return Objects.hash(numbers, week)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class SixTicket {\n")

        sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n")
        sb.append("    week: ").append(toIndentedString(week)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}
