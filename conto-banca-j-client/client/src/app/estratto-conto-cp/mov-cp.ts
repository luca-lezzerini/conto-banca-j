import { ContoPrestito } from "../gestione-cp/conto-prestito";

export class MovCp{
    dataMov:Date;
    tipoMov:string;
    importoMov:number;
    contoP: ContoPrestito;
}
