package phonebook;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MyPhoneBook implements PhoneBookADT {

	ArrayList contacts;
	
	public MyPhoneBook(){
		contacts=new ArrayList();
	}
	
	public void addContact(Contact c){
		contacts.add(c);
	}
	
	public void addContactsFromfile(String fileName){
		BufferedReader br;
		
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb= new StringBuilder();
			String line = br.readLine();
			
			while(line != null){
				String[] lineArr = line.split("");
				contacts.add(new Contact(lineArr[0], lineArr[1]));
				line=br.readLine();
			}
		}
		catch(Exception e){
			System.out.println("File not found !!");
		}
	}
	
	public void reverseList(int nodesToReverse){
		if(nodesToReverse == contacts.size())
			return ;
		else{
			
			Contact c=(Contact)contacts.get(contacts.size()-1);
			contacts.remove(contacts.size()-1);
			contacts.add(nodesToReverse, c);
			reverseList(nodesToReverse+1);
		}
	}


public String toString(int index){
	if(index == contacts.size())
		return "";
	
	else
		return contacts.get(index).toString()+"\n"+toString(index+1);
}

public static void main(String[] args){
	MyPhoneBook oznursBook = new MyPhoneBook();
	oznursBook.addContactsFromfile("c:\\Users\\Busra\\Desktop\\temp.txt");
		System.out.println(oznursBook.toString(0));
		oznursBook.reverseList(0);
		System.out.println(oznursBook.toString(0));
}
}