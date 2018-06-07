import numpy as np
import matplotlib.pyplot as plt
import pylab 
# evenly sampled time at 200ms intervals
#t = np.arange(0., 5., 0.2)

happy = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,]
surprise = [1,0,0,0,0,0,1,1,1,0,0,0,0,0,]
anger = [14,15,9,7,15,6,2,3,2,1,0,0,0,0,]
disgust = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,]
fear = [1,1,1,2,3,4,14,26,57,88,89,90,92,93,]
sadness = [8,14,17,21,41,35,35,33,19,6,6,6,5,5,]
x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
pylab.plot(x, happy, '-v', label='happy')
pylab.plot(x, surprise, '-b', label='surprise')
pylab.plot(x, anger, '-y', label='anger')
pylab.plot(x, disgust, '-g', label='disgust')
pylab.plot(x, fear, '-p', label='fear')
pylab.plot(x, sadness, '-r', label='sadness')
pylab.legend(loc='upper left')
#pylab.ylim(-1.5, 2.0)
#pylab.show()
pylab.savefig('graph.png')
# red dashes, blue squares and green triangles
#plt.plot(x, h, 'r--'label='happy', x, s, 'bs',label='surprise')
#plt.show()
pylab.close(1)
