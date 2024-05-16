package hopital;

import java.util.ArrayList;
import java.util.Scanner;

//creating  class and parameterized constructor
class Patient {
	private int pId;
	private String firstName;
	private String lastName;
	private String emailId;
	private long mobileNo;
	private String gender;
	private String city;
	private String doctorId;
	private String doctorName;
	private String address;
	private long contactNo;
	
	//creating parameterized constructor
	
	public Patient(int pId,String firstName, String lastName, String emailId, long mobileNo, String gender, String city,
			String doctorId, String doctorName, String address, long contactNo) {
		this.pId = pId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.city = city;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.address = address;
		this.contactNo = contactNo;
	}
	// creating getter setter and to get and set the value
	
	public int getpId() {
		return pId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
}


// created main method

public class Hospital_Management_System {
	
	static int index[] = {0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient(0,"a","a","a@mail.com",9898989898L,"Male","a","123","A","a",8989898989L));
		patients.add(new Patient(1,"b","b","b@mail.com",8989898989L,"Male","b","123","B","b",9898989898L));
		patients.add(new Patient(2,"c","c","c@mail.com",8787878787L,"Male","c","123","C","c",7878787878L));
		index[0] = 3;
		
		boolean exit = false;
		while (!exit) {
			
			System.out.println("Hospital Management System \n"
					+ "Press 1 : Register Patient \n"
					+ "Press 2 : View Patient Details\n"
					+ "Press 3 : Search Patient\n"
					+ "Press 4 : Update Patient By Email\n"
					+ "Press 5 : Delete Patient By Mobile\n"
					+ "Press 6 : Exit\n");
			int inp = sc.nextInt();

			switch (inp) {
			case 1:
				System.out.println("You have selected the Patient Registratin Feature.");
				patientRegistration(patients);
				break;

			case 2:
				System.out.println("You have selected the view Patient Details Feature.");
				viewPatient(patients);
				break;

			case 3:
				System.out.println("You have selected the Search Patient Feature");
				searchPatient(patients);
				break;

			case 4:
				System.out.println("You have selected the update Patient by Email Domain Feature.");
				updatePatient(patients);
				break;

			case 5:
				System.out.println("You have selected the Delete Patients by Mobile number Feature.");
				deletePatient(patients);
				break;

			case 6:
				System.out.println("Good Bye Administrator!!. Terminating the Program.");
				exit = true;
				break;

			default:
				System.out.println("You have selected an inappropriate option. Kindly select an appropriate option.");
				break;
			}
		}
		
		sc.close();
	}
//created a deleted pateint function 
	
	private static void deletePatient(ArrayList<Patient> patients) {
		int ind = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile No: ");
		Long mobileNo = sc.nextLong();
		
		for(int i=0;i<patients.size();i++){
			Patient patient = patients.get(i);
			if(patient.getMobileNo() == mobileNo){
				ind = i;
			}
		}
		
		if(ind == -1){
			System.out.println("Patient not found");
			return ;
		}
		
		patients.remove(ind);
		
		System.out.println("Patient deleted sucessfully.");
		
	}

	////created a update pateint function 
	
	private static void updatePatient(ArrayList<Patient> patients) {
		int ind = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Id: ");
		String emailID = sc.nextLine();
		
		for(int i=0;i<patients.size();i++){
			Patient patient = patients.get(i);
			if(patient.getEmailId().equals(emailID)){
				ind = i;
			}
		}
		
		if(ind == -1){
			System.out.println("Patient not found");
			return ;
		}
		
		Patient patient = patients.get(ind);
		
		System.out.println("Enter updated details:");
		System.out.println("Enter First Name ");
		String firstName = sc.nextLine();
		patient.setFirstName(firstName);
		System.out.println("Enter Last Name ");
		String lastName = sc.nextLine();
		patient.setLastName(lastName);
		System.out.println("Enter Email Id ");
		String emailId = sc.nextLine();
		patient.setEmailId(emailId);
		System.out.println("Enter Mobile Number ");
		long mobileNo = sc.nextLong();
		patient.setMobileNo(mobileNo);
		System.out.println("Enter Gender ");
		sc.nextLine();
		String gender = sc.nextLine();
		patient.setGender(gender);
		System.out.println("Enter City ");
		String city = sc.nextLine();
		patient.setCity(city);
		System.out.println("Enter Doctor Id ");
		String doctorId = sc.nextLine();
		patient.setDoctorId(doctorId);
		System.out.println("Enter Doctor Name ");
		String doctorName = sc.nextLine();
		patient.setDoctorName(doctorName);
		System.out.println("Enter Address ");
		String address = sc.nextLine();
		patient.setAddress(address);
		System.out.println("Enter Contact No ");
		Long contactNo = sc.nextLong();
		patient.setContactNo(contactNo);
		System.out.println("Patient Details Updated successfully");
	}

	private static void searchPatient(ArrayList<Patient> patients) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Patient Id of patient: ");
		int patientId = sc.nextInt();
		int f = 0;
		for(Patient patient : patients){
			if(patient.getpId() == patientId){
				System.out.println("Patient Id: "+patient.getpId()+"\nFirst Name: "+patient.getFirstName()+"\nLast Name: "+patient.getLastName()+"\nEmail Id: "+patient.getEmailId()+
						"\nMobile Number: "+patient.getMobileNo()+"\nGender: "+patient.getGender()+"\nCity: "+patient.getCity()+"\nDoctor Id: "+
						patient.getDoctorId()+"\nDoctor Name: "+patient.getDoctorName()+"\nAddress: "+patient.getAddress()+"\nContact No: "+
						patient.getContactNo()+"\n");
				f = 1;
				break;
			}
		}
		
		if(f == 0){
			System.out.println("Patient not found.");
		}
	}

	private static void viewPatient(ArrayList<Patient> patients) {
		
		for(Patient patient : patients){
			System.out.println("Patient Id: "+patient.getpId()+"\nFirst Name: "+patient.getFirstName()+"\nLast Name: "+patient.getLastName()+"\nEmail Id: "+patient.getEmailId()+
					"\nMobile Number: "+patient.getMobileNo()+"\nGender: "+patient.getGender()+"\nCity: "+patient.getCity()+"\nDoctor Id: "+
					patient.getDoctorId()+"\nDoctor Name: "+patient.getDoctorName()+"\nAddress: "+patient.getAddress()+"\nContact No: "+
					patient.getContactNo()+"\n");
		}
		
	}

	private static void patientRegistration(ArrayList<Patient> patients) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name ");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name ");
		String lastName = sc.nextLine();
		System.out.println("Enter Email Id ");
		String emailId = sc.nextLine();
		System.out.println("Enter Mobile Number ");
		long mobileNo = sc.nextLong();
		System.out.println("Enter Gender ");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.println("Enter City ");
		String city = sc.nextLine();
		System.out.println("Enter Doctor Id ");
		String doctorId = sc.nextLine();
		System.out.println("Enter Doctor Name ");
		String doctorName = sc.nextLine();
		System.out.println("Enter Address ");
		String address = sc.nextLine();
		System.out.println("Enter Contact No ");
		Long contactNo = sc.nextLong();
		
		patients.add(new Patient(index[0],firstName,lastName,emailId,mobileNo,gender,city,doctorId,doctorName,address,contactNo));
		System.out.println("Sucessfully registered with Pid : "+index[0]);
		index[0] += 1;
		
	}

}
