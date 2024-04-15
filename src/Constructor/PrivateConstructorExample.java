package Constructor;

class DbTemplate {
    private static DbTemplate dbTemplate;
    private static int queryCounter = 0;
    public void executeQuery(){
        // just execute query
        queryCounter++;
    }
    private DbTemplate(){
        // init DB connection
        // init pool
    }
    //below method is called as factory methods
    public static DbTemplate getDbTemplateInstance(){
        if(dbTemplate==null)
            dbTemplate= new DbTemplate();
        return dbTemplate;
    }
}
public class PrivateConstructorExample{

    public static void main(String[] args) {
        // query execute
        DbTemplate.getDbTemplateInstance().executeQuery();
        String someName = ConstantsClass.someName;
    }

}

class EmpQuerymaker{
    public static void main(String[] args) {
        /*
        * we use this to avoid below code

        DbTemplate dbTemplate = new DbTemplate();
        dbTemplate.executeQuery();
        */
        DbTemplate.getDbTemplateInstance().executeQuery();
    }
}

class ConstantsClass{
    public static final String someName = "vasanth";
    ////
    ////
    private ConstantsClass(){

    }
}