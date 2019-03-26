%write a program to copy an image n-times along x-axis and y axis and add
%border
clc;
clear all;
close all;
file1=input('\n enter input image file name','s');
file2=input('\n enter output image file name','s');
nx=input('\n enter the number of times to be copied along x');
ny=input('\n enter the number of times to be copied along y');
x=imread(file1);
[r,c,d]=size(x);
x(:,c-10:c,:)=0;
x(:,1:10,:)=0;
x(1:10,:,:)=0;
x(r-10:r,:,:)=0;
% to copy image along x axis
c1=1;
for i=1:nx
    y(1:r,c1:i*c,1:d)=x(1:r,1:c,1:d);
    c1=c1+c;
end
[r,c,d]=size(y);
r1=1;
for i=1:ny
    z(r1:r*i,1:c,1:d)=y(1:r,1:c,1:d);
    r1=r1+r;
end
[r,c,d]=size(z);
z(:,c-20:c,:)=0;
z(:,1:20,:)=0;
z(1:20,:,:)=0;
z(r-20:r,:,:)=0;
imshow(z);
imwrite(z,file2);