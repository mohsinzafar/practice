package labAssignmentCase1;
public class SMS implements Observer {

    private final Subj subject;
    private String desc;
    private String uinfo;
    public SMS(Subj subject, String uinfo) {
        if (subject == null) {
            throw new IllegalArgumentException("No Publisher");
        }
        this.subject = subject;
        this.uinfo = uinfo;
    }
    public void update(String desc) {
        this.desc = desc;
        display();
    }
    private void display() {
        System.out.println("[" + uinfo + "]: " + desc);
    }
    public void subscribe() {
        System.out.println("Subscribing " + uinfo + " to " + subject.subjectDetails() );
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed.");
    }
    public void unSubscribe() {
        System.out.println("Unsubscribing " + uinfo + " to " + subject.subjectDetails());
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed");
    }
}
