import { MovCp } from "../estratto-conto-cp/mov-cp";
import { Cliente } from "../gestione-cliente/cliente";

export class ContoPrestito {
   
   id: number;
   codice:string;
   cliente: Cliente;
   listaMovCp : MovCp [] = [];
}