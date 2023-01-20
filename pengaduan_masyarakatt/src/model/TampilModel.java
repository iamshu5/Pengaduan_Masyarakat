package model;


public class TampilModel {
    private String[] NamaColumn; 
    private String[] tabelData;
    
//    Menampung Nilai dari Column
    public TampilModel (String aName[], String tData[]){
        this.NamaColumn = aName;
        this.tabelData = tData;
    }
    
    
//    Menampung Index dari Database
    public String Index(int index){
        return this.tabelData[index];
    }
    
//    Mendapatkan Nilai dari Kolom
    private int getKolomIndex(String NamaColumn){
        for(int i=0; i < this.NamaColumn.length; i++){
            String aColumn = this.NamaColumn[ i ];
            if(aColumn.equals(NamaColumn)){
                return i;
            }
        }
        return -1;
    }
    
//   Kalo kolom index nya kosong, maka NULL
    public String ColumnD(String NamaColumn) {
        int KolomIndex = this.getKolomIndex(NamaColumn);
        if(KolomIndex < 0) {
            return null;
        }
        return this.Index(KolomIndex);
    }
    
    public String[] all(){
        return this.tabelData;
    }

}
