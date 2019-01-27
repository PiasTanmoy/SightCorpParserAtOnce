import requests
import glob, os

#file1 = open("s011002.doc","w")

 
 

for file in glob.glob("*.png"):
    print(file)
    file1 = open(file[:8]+".doc","a")
    file1.write(file)
    json_resp = requests.post( 'https://api-face.sightcorp.com/api/detect/',
                  data  = { 'app_key' : '24753c8338704d769b99730b8790691a' },
                  files = { 'img'     : ( 'filename', open( file, 'rb' ) ) } )

    print "Response : ", json_resp.text
    file1.write(json_resp.text)
