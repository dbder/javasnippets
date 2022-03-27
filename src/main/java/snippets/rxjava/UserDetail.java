package snippets.rxjava;

public class UserDetail {
    public String DOB;
    public String mothersMaidenName;
    public Boolean hasCriminalRecord;
    public String knownIllnesses;

    public UserDetail(String dob, String mothersnee, Boolean hasRecord, String healthproblems){
        this.DOB = dob;
        this.mothersMaidenName = mothersnee;
        this.hasCriminalRecord = hasRecord;
        this.knownIllnesses = healthproblems;
    }
}
