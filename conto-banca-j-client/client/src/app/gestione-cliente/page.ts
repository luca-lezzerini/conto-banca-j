import { Cliente } from "./cliente";

export class Page{
    content: Cliente[];
    totalPages : number;
    totalElements: number;
    last: boolean;
    size: number;
    number : number;
    sort: boolean;
    first:boolean;
    numberOfElements: number;
}