package myuno;



import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

public class TestJsonValid {
	
	final static String SCHEMA_PATH = "./schema_mon_uno.json";

	//=======Variantes valides et existantes=======
	@Test
	public void testReglesOfficielles() throws ValidationException {
	    JSONObject jsonSchema = new JSONObject(
	      new JSONTokener(getClass().getResourceAsStream(SCHEMA_PATH)));
	    JSONObject jsonSubject = new JSONObject(
	      new JSONTokener(getClass().getResourceAsStream("./config_regles_officielles.json")));

	    Schema schema = SchemaLoader.load(jsonSchema);
	    schema.validate(jsonSubject);
	}
	
	@Test
	public void testReglesHandsDown() throws ValidationException {
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream(SCHEMA_PATH)));
			    JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream("./config_hands_down.json")));

			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
	}
	
	//=======Variantes valides et invent�es par moi=======
	@Test
	public void testInvention1() throws ValidationException {
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream(SCHEMA_PATH)));
			    JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream("./config_invention_1.json")));

			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
	}
	
	@Test
	public void testInvention2() throws ValidationException {
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream(SCHEMA_PATH)));
			    JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream("./config_invention_2.json")));

			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
	}
	
	//=======Variantes invalides=======
	@Test
	public void testInvalide1() throws ValidationException {
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream(SCHEMA_PATH)));
			    JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream("./config_invalide_1.json")));

			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
	}
	
	@Test
	public void testInvalide2() throws ValidationException {
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream(SCHEMA_PATH)));
			    JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream("./config_invalide_2.json")));

			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
	}
	
	@Test
	public void testInvalide3() throws ValidationException {
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream(SCHEMA_PATH)));
			    JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(getClass().getResourceAsStream("./config_invalide_3.json")));

			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
	}
	
}
