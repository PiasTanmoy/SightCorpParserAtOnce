import requests
import glob, os

auth_headers = {
    "app_id": "0776736c",
    "app_key": "001665d855b5ae5927b4aa3023be0285"
}

data = {
    'timeout': 60
}


for root, dirs, files in os.walk("."):
    for file in files:
        fullpath = os.path.join(root, file)
        if os.path.splitext(fullpath)[1] == '.png':
        	url = 'https://api.kairos.com/v2/media'
        	print fullpath
        	print(file)
        	file1 = open("I:\Useless2"+"\k"+file[:8]+".doc","a")
        	file1.write("\n"+file)
        	filess = {'source': open( fullpath, 'rb' )}
        	response = requests.post(url, files=filess, data=data, headers=auth_headers)					
        	x= response.json()
        	msg= x['status_message']
        	print msg
        	if(str(msg)=='Complete'):
				#print 1


				id= x['id']
				id=str(id)
				#id.encode('ascii','ignore')
				#print type(id)
				#print id

				auth_headers = {
					"app_id": "0776736c",
					"app_key": "001665d855b5ae5927b4aa3023be0285"
				}

				url = 'https://api.kairos.com/v2/media/' + id

				print url
				print type(url)
				response = requests.get(url, headers=auth_headers)
				x=response.json()

#				print response.json()
				file1.write(str(x))












