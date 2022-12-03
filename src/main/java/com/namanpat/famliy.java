import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class famliy {

    public static void main(String[] args) throws IOException {

        JSONObject obj = new JSONObject();

        obj.put("FirstGen","Manordas");
        obj.put("SecondGen","Umeddas");
        obj.put("ThirdGen","Nathudas");
        obj.put("FourthGen","Sankadas");
        obj.put("FifthGen","Shivlal");
        obj.put("SixthGen","Natwarlal");
        obj.put("SeventhGen","Kalpesh");
        obj.put("EighthGen","Naman");

        FileWriter file = new FileWriter("jsonfamily\\names.json", false);
        file.write(obj.toJSONString());
        file.close();

        System.out.println("Program Successful");




    }

}
