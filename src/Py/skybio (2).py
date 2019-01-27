import requests
import glob, os

for file in glob.glob("*.png"):
    print(file)
    file1 = open("D:\Thesis papers\DATA\cohn-kanade-images\SKyfiles"+"\sky"+file[:8]+".doc","a")
    file1.write("\n"+file)

    json_resp = requests.post( 'http://api.skybiometry.com/fc/faces/detect.json?api_key=p1mqm0oamendi3s3lmuo1voe60&api_secret=kvr2o9055119e7qhh6cesjsuao&attributes=all',
                                                 files = { 'img'     : ( 'filename', open( file, 'rb' ) ) }


                   )

    ##print "Response : ", json_resp.text
    file1.write(json_resp.text)
