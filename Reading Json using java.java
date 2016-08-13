import org.json.simple.JSONObject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class  executionPlan {

	    @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	        JSONParser parser = new JSONParser();
	 
	        try {
	 
	            Object obj = parser.parse(new FileReader(
	                    "C:/Eclipse/Practice/jsonData.txt"));
	 
	            JSONObject jsonObject = (JSONObject) obj;
	 
	            JSONArray tasks = (JSONArray) jsonObject.get("tasks");
	            
	            System.out.println(tasks);
	            ArrayList<ArrayList> Depends = new ArrayList<ArrayList>();
	            ArrayList temp  = new ArrayList();
	            temp.add(0);
	            Depends.add(temp);
	            
	            Iterator<String> iterator = tasks.iterator();
	            
	            int counter = 1;
	            
	            while (iterator.hasNext()) {
	            	Object job = iterator.next();
	            	JSONObject jsonObject2 = (JSONObject) job;
	            	Object name = (Object) jsonObject2.get("Job"+""+counter);
	            	JSONObject jsonObject3 = (JSONObject) name;
	            	ArrayList depends_on = (ArrayList) jsonObject3.get("depends_on");
	            	if(depends_on != null){
	            		Depends.add(depends_on);
	            	}
	            	else{
	            		Depends.add(null);
	            	}
	            	System.out.println(depends_on);
	            	counter++;
	            }
	            
	            System.out.println(Depends);
	            ArrayList<String> Done = new  ArrayList();
	            boolean flag = false;
	            ArrayList nonConflicting = new ArrayList();
	            
	            for(int i=1; i<Depends.size();i++ ){
	            	ArrayList temp1 = Depends.get(i);
	            	if(temp1 == null){
	            		nonConflicting.add("Job"+i);
	            		Done.add("Job"+i);
	            		flag = true;
	            	}
	            	else{
	            		nonConflicting.clear();
	            		
	            		for(int j=0; j<temp1.size(); j++ ){
	            		String a = (String) temp1.get(j);
	            			if(a==null){
	            				nonConflicting.clear();
	            			}
	            			else{
	            				flag = true;
	            				nonConflicting.add("Job"+i);
	            				Done.add("Job"+i);
	            			}
	            		}
	            	}
	            	System.out.println("Batch1: "+nonConflicting);
	            	flag = false;
	            	
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
