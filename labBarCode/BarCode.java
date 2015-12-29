import java.util.ArrayList;
public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private String  bartionary[] = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	_zip=zip;
	_checkDigit=0;
	for(int i=0;i<_zip.length();i++){
	    _checkDigit+=_zip.charAt(i);
	}
	_checkDigit=_checkDigit % 10;
	if(zip.length()!=5){throw new IllegalArgumentException();}
    }

    // postcondition: Creates a copy of a bar code.
    // public BarCode(BarCode x){}


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int t=0;
	for(int i=0;i<_zip.length();i++){
	    t+=_zip.charAt(i);
	}
	t+=_checkDigit;
	return t;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String str = "";
	str+=_zip;
	str+=_checkDigit;
	str+="|";
	for(int i=0;i<5;i++){
	    str+=bartionary[Character.getNumericValue(_zip.charAt(i))];
	}
	str+="|";
	return str;
    }


    public boolean equals(Object other){
	if(other instanceof BarCode){	    
	    if(other.toString().compareTo(toString())==0){
		return true;
	    }
	}
	return false;
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	return (_zip+_checkDigit).compareTo(((BarCode)other)._zip + ((BarCode)other)._checkDigit);
	
}
}
    // postcondition: compares the zip + checkdigit 

