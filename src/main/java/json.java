import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

import org.json.JSONObject;
import org.json.XML;

public class json {
    public static void main(String[] args) {
        String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<msg xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"mqcap.xsd\">\n" +
                "    <rowOp intentSEQ=\"0006529516260712719873008747612956551488\">\n" +
                "        <Row current_ts=\"2023-08-23 11:17:35.723001\" numCols=\"8\" pos=\"00000000020001372473\" table=\"SACOM_SW_OWN.ATM_LOG\" ts=\"2023-08-23 11:15:05.898835\" type=\"I\">\n" +
                "            <col index=\"0\" name=\"SHCLOG_ID\">\n" +
                "                <after>AAEAsgAkZN52XQAB </after>\n" +
                "                <primary_key>1</primary_key>\n" +
                "                <data_type>char</data_type>\n" +
                "            </col>\n" +
                "            <col index=\"1\" name=\"INSTITUTION_ID\">\n" +
                "                <after>1</after>\n" +
                "                <primary_key>0</primary_key>\n" +
                "                <data_type>varchar2</data_type>\n" +
                "            </col>\n" +
                "            <col index=\"2\" name=\"GROUP_NAME\">\n" +
                "                <after>SGE5050101</after>\n" +
                "                <primary_key>0</primary_key>\n" +
                "                <data_type>varchar2</data_type>\n" +
                "            </col>\n" +
                "            <col index=\"3\" name=\"UNIT\">\n" +
                "                <after>97</after>\n" +
                "                <primary_key>0</primary_key>\n" +
                "                <data_type>integer</data_type>\n" +
                "            </col>\n" +
                "            <col index=\"4\" name=\"FUNCTION_CODE\">\n" +
                "                <after>200</after>\n" +
                "                <primary_key>0</primary_key>\n" +
                "                <data_type>varchar2</data_type>\n" +
                "            </col>\n" +
                "            <col index=\"5\" name=\"LOGGED_TIME\">\n" +
                "                <after>2023-08-18 02:34:53.000000000</after>\n" +
                "                <primary_key>0</primary_key>\n" +
                "                <data_type>timestamp</data_type>\n" +
                "            </col>\n" +
                "            <col index=\"6\" name=\"LOG_DATA\">\n" +
                "                <after>12097002033P20</after>\n" +
                "                <primary_key>0</primary_key>\n" +
                "                <data_type>varchar2</data_type>\n" +
                "            </col>\n" +
                "            <col index=\"7\" name=\"SITE_ID\">\n" +
                "                <after>1</after>\n" +
                "                <primary_key>1</primary_key>\n" +
                "                <data_type>integer</data_type>\n" +
                "            </col>\n" +
                "        </Row>\n" +
                "    </rowOp>\n" +
                "</msg>";
        JSONObject xmlJSONObj = XML.toJSONObject(xmlData);
        String jsonPrettyPrintString = xmlJSONObj.toString(4);
        System.out.println(jsonPrettyPrintString);
    }
}
