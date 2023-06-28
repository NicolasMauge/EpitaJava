import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'printImg'
})
export class PrintImgPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return "https://image.tmdb.org/t/p/original" + value;
    //return "https://image.tmdb.org/t/p/w500" + value;
  }

}
