import { Router } from "@angular/router";
import { SharingDataService } from "./../sharing-data.service";
import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-rsvp-accept",
  templateUrl: "./rsvp-accept.component.html",
  styleUrls: ["./rsvp-accept.component.scss"]
})
export class RsvpAcceptComponent implements OnInit {
  flagAccept: boolean = false;
  flagReject: boolean = false;
  flagAcceptLoop: boolean = false;
  flagRejectLoop: boolean = false;
  flagReaccept: boolean;
  countAccept: number = 0;
  countReject: number = 0;
  countReaccept: number = 0;
  name: string;

  constructor(private service: SharingDataService, private router: Router) {}

  ngOnInit() {}

  accept() {
    this.flagAccept = true;
    this.countAccept++;
    console.log(this.countAccept);
    this.flagAcceptLoop = true;
  }

  reject() {
    this.flagReject = true;
    this.countReject++;
    console.log(this.countReject);
    this.flagRejectLoop = true;
  }

  path() {
    var nameLocal = this.service.sendCityName();
    this.name = nameLocal;
    this.router.navigate(["home",this.name]);
  }
}
