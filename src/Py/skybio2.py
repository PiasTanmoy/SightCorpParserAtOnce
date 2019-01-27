import requests
import glob, os

for file in glob.glob("*.png"):
    print(file)
    file1 = open("D:\Thesis papers\DATA\cohn-kanade-images\SKyfiles"+"\sky"+file[:8]+".doc","a")
    file1.write("\n"+file)

    json_resp = requests.post( 'http://api.skybiometry.com/fc/faces/detect.json?api_key=mqhbj7es3otibjp0qclakjf4u7&api_secret=p9nms7p7704apsscegc3fce0uh=all',
                                                 files = { 'img'     : ( 'filename', open( file, 'rb' ) ) }


                   )

    ##print "Response : ", json_resp.text
    file1.write(json_resp.text)
