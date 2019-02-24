%image_proc_4.m : Write a program to take reflection of an imaghe along
%y-axis

clc;
clear all;
close all;
file1=input('\nEnter Input Image file name=','s');
file2=input('Enter Output Image name=','s');
x=imread(file1);
[r,c,d]=size(x);
y=x; %copying input image to output image
y(1:r, c+1:2*c, 1:d)=x(1:r, c:-1:1, 1:d); %taking reflection along y-axis
imwrite(y,file2);
imshow(y);