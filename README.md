# TextAnalyzer


## About
TextAnalyzer is is a simple application to get statistics about the text inside many files that may be in different directories. You can get:
* list of words that occur most frequently;
* list of words which are the least common;
* general statistics about the number of words.

## How to use 
Thanks to the flexible design, you can choose one of the file traversal strategies presented in the application, which will be processed in a single thread. You can also set up multi-threaded file traversal based on the available strategies, specifying for each thread the files it will process.
Available strategies:
* FILE (for one file); 
* DIRECTORY (for all files in directory);
* RECURSIVE (recursively visit all the files in a file tree and get statistics).











