package emailsending;
import java.util.Properties;


import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


	public class email {
		
	
	    public static void main(String[] args) {
	        // Sender and receiver email
	        final String fromEmail = "kapidarsha431@gmail.com";  // Replace with your email
	        final String password = "zgdi xvmw ttma eguv";        // Use App Password if using Gmail
	        String toEmail = "darsa3110@gmail.com";            // Replace with receiver email

	        // Set SMTP properties
	        Properties props = new Properties();
	        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
	        props.put("mail.smtp.port", "587");            // TLS Port
	        props.put("mail.smtp.auth", "true");           // Enable authentication
	        props.put("mail.smtp.starttls.enable", "true");// Enable STARTTLS

	        // Create session with authentication
	        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(fromEmail, password);
	            }
	        });

	        try {
	            // Create message
	            Message msg = new MimeMessage(session);
	            msg.setFrom(new InternetAddress(fromEmail, "Kapitharshana"));
	            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
	            msg.setSubject("Test Email from Java Program");
	            msg.setText("Hello Darshana! This is a test email sent from Java.");

	            // Send the message
	            Transport.send(msg);

	            System.out.println(" Email sent successfully!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
