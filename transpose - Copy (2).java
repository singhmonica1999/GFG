interface client{
    void sendEmail(email,body);
}
class gmailclient implements client{
    void sendEmail(email,body){
//
    }
}
class Emailservice implement client{

private client cl;
EmailService(){
cl=new gmailclient;
}

void sendEmail(emailaddress,body){
//
    }
}

