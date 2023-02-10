
package soyagaci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Soyagaci {
    
    
    
    
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList <Integer> id = new ArrayList<>();
        ArrayList <String> isim = new ArrayList<>();
        ArrayList <String> soyisim = new ArrayList<>();
        ArrayList <Date> dogumtarihi = new ArrayList<>();
        ArrayList <String> esi = new ArrayList<>();
        ArrayList <String> anneadi = new ArrayList<>();
        ArrayList <String> babaadi = new ArrayList<>();
        ArrayList <String> kangrubu = new ArrayList<>();
        ArrayList <String> meslek = new ArrayList<>();
        ArrayList <String> medenihal = new ArrayList<>();
        ArrayList <String> kizliksoyad = new ArrayList<>();
        ArrayList <String> cinsiyet = new ArrayList<>();
         ArrayList <String> baslik = new ArrayList<>();
         ArrayList <Integer> esid = new ArrayList<>();
           
        try{
            
            File file1 = new File (
                    "C:\\Users\\Acer\\Documents\\NetBeansProjects\\soyagaci\\src\\Dosya\\testfile.xlsx");
            
        FileInputStream file = new FileInputStream(file1);
         XSSFWorkbook wb = new XSSFWorkbook(file) ;
         int j=0;
         while(j<4){
            XSSFSheet sheet1 = wb.getSheetAt(j);
            Iterator<Row> rowIterator = sheet1.iterator();
            while(rowIterator.hasNext()){
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    if(row.getRowNum()==0){
                        baslik.add(cell.getStringCellValue());
                        
                    }
                    else
                    {
                        if(cell.getColumnIndex()==0){
                            id.add((int)cell.getNumericCellValue());
                        }
                        else if(cell.getColumnIndex()==1){
                            isim.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==2){
                            soyisim.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==3){
                            
                           //dogumtarihi.add(cell.getDateCellValue());
                        }
                        else if(cell.getColumnIndex()==4){
                            esi.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==5){
                            esid.add((int)cell.getNumericCellValue());
                        }
                        else if(cell.getColumnIndex()==6){
                            anneadi.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==7){
                            babaadi.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==8){
                            kangrubu.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==9){
                            meslek.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==10){
                            medenihal.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==11){
                            kizliksoyad.add(cell.getStringCellValue());
                        }
                        else if(cell.getColumnIndex()==12){
                            cinsiyet.add(cell.getStringCellValue());
                        }
                        
                        
                    }
                    
                    
                }
                
            }
            j++;
         }
        
    
         System.out.println("Liste"+id);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Liste"+isim);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Liste"+soyisim);
        
        }
         
        
        
        catch(IOException e){
         e.printStackTrace();
        }
        
        
       Scanner in = new Scanner(System.in);
       List<Kisi> kisiler = new ArrayList<Kisi>();
       for(int i =0; i<id.size();i++)
       {
       Kisi kisi = new Kisi();
       kisi.id = id.get(i);
       kisi.ad = isim.get(i);
       kisi.soyad = soyisim.get(i);
       kisi.anne_adi = anneadi.get(i);
       kisi.baba_adi = babaadi.get(i);
       kisi.cinsiyet = cinsiyet.get(i);
      // kisi.dogumTarihi = dogumtarihi.get(i);
       kisi.kan_grubu = kangrubu.get(i);
       kisi.kizlik_soyadi = kizliksoyad.get(i);
       kisi.meslek = meslek.get(i);
       kisiler.add(kisi);
       }
        System.out.println(""+kisiler.get(0));
        System.out.println(""+kisiler.get(1).anne_adi);
       
       
       
    }
}

    

