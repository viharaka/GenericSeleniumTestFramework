import os
import commands

workspace_dir ="/home/aks/workspace/"
get_source_dir= workspace_dir + "sample/src/"
lib_source_dir=workspace_dir+"sample/lib/"
bin_source_dir=workspace_dir+"sample/bin/"

for dirName, subdirList, fileList in os.walk(get_source_dir):
    print('Found directory: %s' % dirName)
    for fname in fileList:
    	if fname.endswith(".java"):
    		print('\t%s' % fname)
    		file_to_compile = dirName+"/"+fname
    		print "File to compile : %s"%file_to_compile
    		status, output = commands.getstatusoutput("javac -d "+bin_source_dir+" "+file_to_compile)
    		if status:
    			print "File compilation ERROR : %s , output shown below for the error thrown"%file_to_compile
    			print output
    		else:
    			print "File compile is SUCCESS : %s"%file_to_compile