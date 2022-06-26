package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibUpload {
	
	private static final String filePath="C:\\Users\\90551\\Desktop\\Eclipse Projeler\\2022 Yaz-Haziran Arsiv\\001JSPDeneme\\src\\main\\webapp\\yazi";
    private ArrayList<String> filePathList=new ArrayList<>();
    
    private void setFileList() {
    	 File fileDirectory= new File(filePath);
    		for (File chDir : fileDirectory.listFiles()) { // içindeki dosyalarý ve klasörleri listeler
    		filePathList.add(chDir.getAbsolutePath()); // lsitemize ekleme iþlemi yapar
    }
   }
   
    public Map<String, String> getFileMap(){
    	setFileList();
		Map<String, String> fileMap=new HashMap<>();

    	for(String file:filePathList) {
    		File ff=new File(file);
    		try(BufferedReader bf=new BufferedReader(new FileReader(ff));){
    			String line;
    			StringBuilder sb=new StringBuilder();
    			while ((line = bf.readLine()) != null) {
					sb.append(line);
				}
    			fileMap.put(ff.getName(), sb.toString());
    		}catch (Exception e) {
				// TODO: handle exception
			}
    		
    		
    	}
    	
    	return fileMap;
    }

}
