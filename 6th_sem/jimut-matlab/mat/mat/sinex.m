function [sx] = sinex(theta)
    %format long;
    x_rad = (theta*pi)/180;
    k=1;
    c=0;
    sx=0;
    for i=1:200
       
       %fprintf("k = %d",k);
       if(mod(c,2)==0)
           sx=sx+(x_rad^k)/factorial(k);
       else 
           sx=sx-(x_rad^k)/factorial(k);
       end
       k=k+2;
       c=c+1;
    end
end