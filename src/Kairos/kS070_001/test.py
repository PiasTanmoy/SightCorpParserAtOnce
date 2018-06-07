import numpy as np
import matplotlib.pyplot as plt
import pylab 
# evenly sampled time at 200ms intervals
#t = np.arange(0., 5., 0.2)
joy = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,]
surprise = [0,0,0,0,0,0,0,12,65,56,79,54,48,66,54,88,93,92,97,94,]
anger = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,]
disgust = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,]
fear = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,]
sadness = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,]
x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

pylab.plot(x, happy, '-v', label='happy')
pylab.plot(x, surprise, '-b', label='surprise')
pylab.plot(x, anger, '-y', label='anger')
pylab.plot(x, disgust, '-g', label='disgust')
pylab.plot(x, fear, '-p', label='fear')
pylab.plot(x, sadness, '-r', label='sadness')
pylab.plot(x, neutral, '-m', label='neutral')
pylab.plot(x, contempt, '-k', label='contempt')
pylab.legend(loc='upper left')
pylab.savefig('graph.png')
pylab.close(1)
