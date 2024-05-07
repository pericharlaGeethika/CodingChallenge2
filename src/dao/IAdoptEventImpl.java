package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.IAdoptEvent;
//import entity.Customer;
import entity.model.Participants;
import util.DBConnUtil;
public class IAdoptEventImpl implements IAdoptEvent{
	
	private static final String Insert_participant="insert into participants( ParticipantID,ParticipantName,ParticipantType,EventID) values(?,?,?,?)";
	
	
	public void registerParticipant(Participants  participant)
	{
		try(Connection con=DBConnUtil.getConnection("db.properties");PreparedStatement pstmt = con.prepareStatement(Insert_participant)){
			   System.out.println("connected");
			   pstmt.setInt(1, participant.getParticipantID());
			   pstmt.setString(2, participant.getParticipantName());
			   pstmt.setString(3, participant.getParticipantType());
			   pstmt.setInt(4, participant.getEventID());
			
			   
			   int rowsInserted = pstmt.executeUpdate();
       	    if (rowsInserted > 0) {
       	        System.out.println("A new participant added");
       	        System.out.println("Participant:"+participant.toString());
       	    } else {
       	        System.out.println("Failed to add participant");
       	    }
			   
		}catch(SQLException ex){
	    	System.err.println("error while adding participant");
	    	ex.printStackTrace();
	    }
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NewCustomerServiceImpl refe = new NewCustomerServiceImpl();
		 * 
		IAdoptEventImpl refe=new IAdoptEventImpl();
		Participants participant=new Participants(16,"tt","ADOPTER",1,1);
		refe.registerParticipant(participant);

		//var refe=new  NewCustomerServiceImpl();
        //Customer customer=refe.getCustomerById(2);
	}*/
}